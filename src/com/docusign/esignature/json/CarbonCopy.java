/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * 
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */
 
package com.docusign.esignature.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "routingOrder",
    "requireIdLookup",
    "accessCode",
    "clientUserId",
    "recipientId",
    "name",
    "email",
    "status"
})
public class CarbonCopy {

    @JsonProperty("routingOrder")
    private String routingOrder;
    @JsonProperty("requireIdLookup")
    private String requireIdLookup;
    @JsonProperty("accessCode")
    private String accessCode;
    @JsonProperty("clientUserId")
    private String clientUserId;
    @JsonProperty("recipientId")
    private String recipientId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("status")
    private String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("routingOrder")
    public String getRoutingOrder() {
        return routingOrder;
    }

    @JsonProperty("routingOrder")
    public void setRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
    }

    public CarbonCopy withRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
        return this;
    }

    @JsonProperty("requireIdLookup")
    public String getRequireIdLookup() {
        return requireIdLookup;
    }

    @JsonProperty("requireIdLookup")
    public void setRequireIdLookup(String requireIdLookup) {
        this.requireIdLookup = requireIdLookup;
    }

    public CarbonCopy withRequireIdLookup(String requireIdLookup) {
        this.requireIdLookup = requireIdLookup;
        return this;
    }

    @JsonProperty("accessCode")
    public String getAccessCode() {
        return accessCode;
    }

    @JsonProperty("accessCode")
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public CarbonCopy withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    @JsonProperty("clientUserId")
    public String getClientUserId() {
        return clientUserId;
    }

    @JsonProperty("clientUserId")
    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }

    public CarbonCopy withClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
        return this;
    }

    @JsonProperty("recipientId")
    public String getRecipientId() {
        return recipientId;
    }

    @JsonProperty("recipientId")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public CarbonCopy withRecipientId(String recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CarbonCopy withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public CarbonCopy withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public CarbonCopy withStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
