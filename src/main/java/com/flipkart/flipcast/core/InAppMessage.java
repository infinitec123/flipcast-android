/*
 * Copyright 2016 Phaneesh Nagaraja <phaneesh.n@gmail.com>.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.flipkart.flipcast.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author phaneesh
 */
@Data
@AllArgsConstructor(suppressConstructorProperties = true)
@NoArgsConstructor
@Builder
public class InAppMessage {

    public final static String STATUS_NEW = "NEW";
    public final static String STATUS_READ = "READ";

    @SerializedName("id")
    private String id;

    @SerializedName("configName")
    private String configName;

    @SerializedName("priority")
    private String priority;

    @SerializedName("deviceId")
    private String deviceId;

    @SerializedName("messageType")
    private String messageType;

    @SerializedName("message")
    public String message;

    @SerializedName("tags")
    public List<String> tags;

    @SerializedName("ttl")
    public long ttl;

    @SerializedName("status")
    public String status;

    @SerializedName("created")
    public long created;
}
