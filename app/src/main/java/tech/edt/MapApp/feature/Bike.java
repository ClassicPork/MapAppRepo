package tech.edt.MapApp.feature;

import com.google.android.gms.maps.model.BitmapDescriptor;

import tech.edt.MapApp.Util;

/**
 * Created by class on 2017-10-28.
 */

public class Bike extends Feature {
    /**
     * Search suggestion stuff
     * (Bikes are not searchable
     */
    public static final String CREATOR = "EDT";

    private String desc;
    private String buildingCode;

    public Bike(double lat, double lng, String name, String buildingCode, String desc) {
        super(lat, lng, name, false);
        this.desc = desc;
        this.buildingCode = buildingCode;
    }

    public BitmapDescriptor getIcon() {
        return Util.getBikeBMP();
    }

    //How many bikes and racks
    public String getSnippet() {
        return getDesc();
    }

    public String getDesc() {
        return desc;
    }

    public String getBuildingCode() {
        return buildingCode;
    }
}