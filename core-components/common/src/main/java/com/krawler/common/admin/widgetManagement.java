/*
 * Copyright (C) 2012  Krawler Information Systems Pvt Ltd
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package com.krawler.common.admin; 

import com.krawler.common.admin.User;
import java.util.Date;

public class widgetManagement implements java.io.Serializable {
    private String id;
    private String widgetstate;
//    private Date modifiedon;
    private Long modifiedOn;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Date getModifiedon() {
        if(modifiedOn!=null)
            return new Date(modifiedOn);
        return null;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedOn = modifiedon.getTime();
    }

    public String getWidgetstate() {
        return widgetstate;
    }

    public void setWidgetstate(String widgetstate) {
        this.widgetstate = widgetstate;
    }
}
