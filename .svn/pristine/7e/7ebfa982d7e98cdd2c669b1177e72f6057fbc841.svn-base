/*
 * Activiti Modeler component part of the Activiti project
 * Copyright 2005-2014 Alfresco Software, Ltd. All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
'use strict';

var ACTIVITI = ACTIVITI || {};
var baseUrl = window.document.location.protocol + "//"
		+ window.document.location.host + "/";
var shortenedUrl = window.document.location.href.replace(baseUrl, "");
baseUrl = baseUrl + shortenedUrl.substring(0, shortenedUrl.indexOf("/"));

ACTIVITI.CONFIG = {
	'contextRoot' : baseUrl + '/jsp/act/service',
};

var dynamicLoading = {
	css : function(path) {
		if (!path || path.length === 0) {
			throw new Error('argument "path" is required !');
		}
		var head = document.getElementsByTagName('head')[0];
		var link = document.createElement('link');
		link.href = path;
		link.rel = 'stylesheet';
		link.type = 'text/css';
		head.appendChild(link);
	},
	js : function(path) {
		if (!path || path.length === 0) {
			throw new Error('argument "path" is required !');
		}
		var head = document.getElementsByTagName('head')[0];
		var script = document.createElement('script');
		script.src = path;
		script.type = 'text/javascript';
		head.appendChild(script);
	}
};

//动态加载 CSS 文件
dynamicLoading.css(baseUrl + "/jsp/act/process-editor/editor-app/libs/jquery.ztree.all-3.5/zTreeStyle.css");
 
//动态加载 JS 文件
dynamicLoading.js(baseUrl + "/jsp/act/process-editor/editor-app/libs/jquery.ztree.all-3.5/jquery.ztree.all-3.5.min.js");

