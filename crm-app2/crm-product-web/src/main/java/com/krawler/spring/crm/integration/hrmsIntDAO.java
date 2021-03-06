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
package com.krawler.spring.crm.integration;

import com.krawler.common.service.ServiceException;
import com.krawler.spring.common.KwlReturnObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface hrmsIntDAO {
    public KwlReturnObject getFinalGoals(HashMap<String, Object> requestParams, ArrayList filter_names, ArrayList filter_params) throws ServiceException;
    public String goalsdelete(String id) throws ServiceException;
    public void goalsArchive(String id) throws ServiceException ;
    public int goalsDateCheck(HashMap<String, Object> requestParams) throws ServiceException;
    public String goalsInsert(HashMap requestParams) throws ServiceException ;
}
