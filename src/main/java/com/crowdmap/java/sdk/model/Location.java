/*******************************************************************************
 * Copyright (c) 2010 - 2013 Ushahidi Inc.
 * All rights reserved
 * Website: http://www.ushahidi.com
 *
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3 Usage
 * This file may be used under the terms of the GNU AFFERO GENERAL
 * PUBLIC LICENSE Version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU AFFERO GENERAL PUBLIC LICENSE Version 3 requirements
 * will be met: http://www.gnu.org/licenses/agpl.html.
 ******************************************************************************/
package com.crowdmap.java.sdk.model;

import java.io.Serializable;

/**
 * Location model class
 */
public class Location implements Serializable {

    /**
     * Seria version UID
     */
    private static final long serialVersionUID = -4499118399170068867L;

    private int locationId;

    private String fsqVenueId;

    private Geometry geometry;

    private String name;

    private String region;

    /**
     * @return the locationId
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * @param locationId the locationId to set
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    /**
     * @return the fsqVenueId
     */
    public String getFsqVenueId() {
        return fsqVenueId;
    }

    /**
     * @param fsqVenueId the fsqVenueId to set
     */
    public void setFsqVenueId(String fsqVenueId) {
        this.fsqVenueId = fsqVenueId;
    }

    /**
     * @return the geometry
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * @param geometry the geometry to set
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", fsqVenueId=" + fsqVenueId +
                ", geometry=" + geometry +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
