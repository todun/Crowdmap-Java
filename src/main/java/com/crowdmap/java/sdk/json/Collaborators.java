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
package com.crowdmap.java.sdk.json;

import com.google.gson.annotations.SerializedName;

import com.crowdmap.java.sdk.model.Collaborator;

import java.io.Serializable;
import java.util.List;

/**
 * List of collaborators
 */
public class Collaborators extends Response implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -663819341932877092L;

    @SerializedName("maps_collaborators")
    private List<Collaborator> collaborators;

    public List<Collaborator> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(List<Collaborator> collaborators) {
        this.collaborators = collaborators;
    }

    @Override
    public String toString() {
        return "Collaborators{" +
                "collaborators=" + collaborators +
                "}," + super.toString();
    }
}
