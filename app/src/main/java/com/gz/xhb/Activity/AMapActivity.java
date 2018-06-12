package com.gz.xhb.Activity;

import android.Manifest;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.gz.xhb.R;
import com.gz.xhb.util.CheckPermissionUtil;
import com.gz.xhb.util.ToolBarUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zdj on 2018/6/5.
 */

public class AMapActivity extends XHBBaseActivity {
    MapView mapView;
    AMap aMap;
    private ArrayList<MarkerOptions> markerOptionlst = new ArrayList<MarkerOptions>();
    Map<String, Object> hashMap = new HashMap<>();
    private Marker currentMarker;
    private Location currentLocation;
    private UiSettings mUiSettings;//定义一个UiSettings对象


    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_amap;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        ToolBarUtil.setToolBar(this,"电子地图");
        mapView = (MapView) findViewById(R.id.mapView_amapHome);
        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
        mapView.onCreate(savedInstanceState);

        setMapView();
        if(CheckPermissionUtil.hasPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)){
            getLocation();
        }else {
            CheckPermissionUtil.getLocationPermissions(this,101);
        }
    }

    private void setMapView() {
        if (aMap == null) {
            aMap = mapView.getMap();
//            aMap.setMapType(AMap.MAP_TYPE_SATELLITE);// 设置卫星地图模式，aMap是地图控制器对象。

            //控制地图缩放比例
            aMap.moveCamera(CameraUpdateFactory.zoomTo(10));
            //设置logo的位置
            mUiSettings = aMap.getUiSettings();//实例化UiSettings类对象
            mUiSettings.setLogoPosition(AMapOptions.LOGO_MARGIN_RIGHT);


//            aMap.setLocationSource(this);//通过aMap对象设置定位数据源的监听
            mUiSettings.setMyLocationButtonEnabled(true); //显示默认的定位按钮
            aMap.setMyLocationEnabled(true);// 可触发定位并显示当前位置
        }
    }

    public void getLocation() {
        MyLocationStyle myLocationStyle;
        myLocationStyle = new MyLocationStyle();//初始化定位蓝点样式类myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATION_ROTATE);//连续定位、且将视角移动到地图中心点，定位点依照设备方向旋转，并且会跟随设备移动。（1秒1次定位）如果不设置myLocationType，默认也会执行此种模式。
        myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATE) ;//定位一次，且将视角移动到地图中心点。
//        myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER);//连续定位、蓝点不会移动到地图中心点，定位点依照设备方向旋转，并且蓝点会跟随设备移动。。
//        myLocationStyle.interval(2000); //设置连续定位模式下的定位间隔，只在连续定位模式下生效，单次定位模式下不会生效。单位为毫秒。
        aMap.setMyLocationStyle(myLocationStyle);//设置定位蓝点的Style
        aMap.getUiSettings().setMyLocationButtonEnabled(true);//设置默认定位按钮是否显示，非必需设置。
        aMap.setMyLocationEnabled(true);// 设置为true表示启动显示定位蓝点，false表示隐藏定位蓝点并不进行定位，默认是false。
    }

}
