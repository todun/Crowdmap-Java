/*******************************************************************************
 * Copyright (c) 2010 - 2014 Ushahidi Inc.
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

package com.crowdmap.java.sdk.service.api;

import com.crowdmap.java.sdk.json.About;
import com.crowdmap.java.sdk.json.OEmbed;
import com.crowdmap.java.sdk.json.RegisteredMap;
import com.crowdmap.java.sdk.json.Response;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import static com.crowdmap.java.sdk.net.ICrowdmapConstants.SEGMENT_ABOUT;
import static com.crowdmap.java.sdk.net.ICrowdmapConstants.SEGMENT_HEARTBEAT;
import static com.crowdmap.java.sdk.net.ICrowdmapConstants.SEGMENT_OEMBED;
import static com.crowdmap.java.sdk.net.ICrowdmapConstants.SEGMENT_REGISTEREDMAP;

/**
 * Crowdmap Utility Interface
 */
public interface UtilityInterface {

    @GET(SEGMENT_HEARTBEAT)
    Response heartbeat();

    @GET(SEGMENT_ABOUT)
    About about();

    @GET(SEGMENT_OEMBED)
    OEmbed oEmbed(@Query("url") String url);

    @GET(SEGMENT_REGISTEREDMAP + "{domain}/")
    RegisteredMap registeredMap(@Path("domain") String domain);
}
