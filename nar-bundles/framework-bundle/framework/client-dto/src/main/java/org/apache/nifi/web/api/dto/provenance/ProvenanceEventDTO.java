/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.dto.provenance;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.nifi.web.api.dto.util.TimestampAdapter;

/**
 * A provenance event.
 */
@XmlType(name = "provenanceEvent")
public class ProvenanceEventDTO {

    private String id;

    // in search results table
    private Long eventId;
    private Date eventTime;
    private Long eventDuration;
    private Long lineageDuration;
    private String eventType;
    private String flowFileUuid;
    private String fileSize;
    private Long fileSizeBytes;
    private String clusterNodeId;    // include when clustered
    private String clusterNodeAddress; // include when clustered

    private String groupId;
    private String componentId;
    private String componentType;
    private String componentName;
    private String sourceSystemFlowFileId;
    private String alternateIdentifierUri;
    private Collection<AttributeDTO> attributes;
    private List<String> parentUuids;
    private List<String> childUuids;

    private String transitUri;

    private String relationship;
    private String details;

    // content
    private Boolean contentEqual;
    private Boolean inputContentAvailable;
    private String inputContentClaimSection;
    private String inputContentClaimContainer;
    private String inputContentClaimIdentifier;
    private Long inputContentClaimOffset;
    private String inputContentClaimFileSize;
    private Long inputContentClaimFileSizeBytes;
    private Boolean outputContentAvailable;
    private String outputContentClaimSection;
    private String outputContentClaimContainer;
    private String outputContentClaimIdentifier;
    private Long outputContentClaimOffset;
    private String outputContentClaimFileSize;
    private Long outputContentClaimFileSizeBytes;

    // replay
    private Boolean replayAvailable;
    private String replayExplanation;
    private String sourceConnectionIdentifier;

    /**
     * The event uuid.
     *
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The event id.
     *
     * @return
     */
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * The time the event occurred.
     *
     * @return
     */
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * The UUID of the FlowFile for this event.
     *
     * @return
     */
    public String getFlowFileUuid() {
        return flowFileUuid;
    }

    public void setFlowFileUuid(String flowFileUuid) {
        this.flowFileUuid = flowFileUuid;
    }

    /**
     * The size of the FlowFile for this event.
     *
     * @return
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * The size of the FlowFile in bytes for this event.
     *
     * @return
     */
    public Long getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    /**
     * The type of this event.
     *
     * @return
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * The attributes for the FlowFile for this event.
     *
     * @return
     */
    public Collection<AttributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(Collection<AttributeDTO> attributes) {
        this.attributes = attributes;
    }

    /**
     * The id of the group that this component resides in. If the component is
     * no longer in the flow, the group id will not be set.
     *
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The id of the component that generated this event.
     *
     * @return
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * The name of the component that generated this event.
     *
     * @return
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * The type of the component that generated this event.
     *
     * @return
     */
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * The source/destination system URI if the event was a RECEIVE/SEND.
     *
     * @return
     */
    public String getTransitUri() {
        return transitUri;
    }

    public void setTransitUri(String transitUri) {
        this.transitUri = transitUri;
    }

    /**
     * The alternate identifier URI for the FlowFile for this event.
     *
     * @return
     */
    public String getAlternateIdentifierUri() {
        return alternateIdentifierUri;
    }

    public void setAlternateIdentifierUri(String alternateIdentifierUri) {
        this.alternateIdentifierUri = alternateIdentifierUri;
    }

    /**
     * The identifier of the node where this event originated.
     *
     * @return
     */
    public String getClusterNodeId() {
        return clusterNodeId;
    }

    public void setClusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
    }

    /**
     * The label to use to show which node this event originated from.
     *
     * @return
     */
    public String getClusterNodeAddress() {
        return clusterNodeAddress;
    }

    public void setClusterNodeAddress(String clusterNodeAddress) {
        this.clusterNodeAddress = clusterNodeAddress;
    }

    /**
     * The parent uuids for this event.
     *
     * @return
     */
    public List<String> getParentUuids() {
        return parentUuids;
    }

    public void setParentUuids(List<String> parentUuids) {
        this.parentUuids = parentUuids;
    }

    /**
     * The child uuids for this event.
     *
     * @return
     */
    public List<String> getChildUuids() {
        return childUuids;
    }

    public void setChildUuids(List<String> childUuids) {
        this.childUuids = childUuids;
    }

    /**
     * The duration of the event, in milliseconds.
     *
     * @return
     */
    public Long getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(Long eventDuration) {
        this.eventDuration = eventDuration;
    }

    /**
     * The duration since the lineage began, in milliseconds.
     *
     * @return
     */
    public Long getLineageDuration() {
        return lineageDuration;
    }

    public void setLineageDuration(Long lineageDuration) {
        this.lineageDuration = lineageDuration;
    }

    /**
     * The source system FlowFile id.
     *
     * @return
     */
    public String getSourceSystemFlowFileId() {
        return sourceSystemFlowFileId;
    }

    public void setSourceSystemFlowFileId(String sourceSystemFlowFileId) {
        this.sourceSystemFlowFileId = sourceSystemFlowFileId;
    }

    /**
     * If this represents a route event, this is the relationship to which the
     * flowfile was routed.
     *
     * @return
     */
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * The event details.
     *
     * @return
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Whether or not the input and output content claim is the same.
     *
     * @return
     */
    public Boolean getContentEqual() {
        return contentEqual;
    }

    public void setContentEqual(Boolean contentEqual) {
        this.contentEqual = contentEqual;
    }

    /**
     * Returns whether or not the output content is still available.
     *
     * @return
     */
    public Boolean getOutputContentAvailable() {
        return outputContentAvailable;
    }

    public void setOutputContentAvailable(Boolean outputContentAvailable) {
        this.outputContentAvailable = outputContentAvailable;
    }

    /**
     * Returns the Section in which the output Content Claim lives, or
     * <code>null</code> if no Content Claim exists.
     *
     * @return
     */
    public String getOutputContentClaimSection() {
        return outputContentClaimSection;
    }

    public void setOutputContentClaimSection(String contentClaimSection) {
        this.outputContentClaimSection = contentClaimSection;
    }

    /**
     * Returns the Container in which the output Content Claim lives, or
     * <code>null</code> if no Content Claim exists.
     *
     * @return
     */
    public String getOutputContentClaimContainer() {
        return outputContentClaimContainer;
    }

    public void setOutputContentClaimContainer(String outputContentClaimContainer) {
        this.outputContentClaimContainer = outputContentClaimContainer;
    }

    /**
     * Returns the Identifier of the output Content Claim, or <code>null</code>
     * if no Content Claim exists.
     *
     * @return
     */
    public String getOutputContentClaimIdentifier() {
        return outputContentClaimIdentifier;
    }

    public void setOutputContentClaimIdentifier(String outputContentClaimIdentifier) {
        this.outputContentClaimIdentifier = outputContentClaimIdentifier;
    }

    /**
     * Returns the offset into the the output Content Claim where the FlowFile's
     * content begins, or <code>null</code> if no Content Claim exists.
     *
     * @return
     */
    public Long getOutputContentClaimOffset() {
        return outputContentClaimOffset;
    }

    public void setOutputContentClaimOffset(Long outputContentClaimOffset) {
        this.outputContentClaimOffset = outputContentClaimOffset;
    }

    /**
     * Returns the formatted file size of the input content claim.
     *
     * @return
     */
    public String getOutputContentClaimFileSize() {
        return outputContentClaimFileSize;
    }

    public void setOutputContentClaimFileSize(String outputContentClaimFileSize) {
        this.outputContentClaimFileSize = outputContentClaimFileSize;
    }

    /**
     * Returns the number of bytes of the input content claim.
     *
     * @return
     */
    public Long getOutputContentClaimFileSizeBytes() {
        return outputContentClaimFileSizeBytes;
    }

    public void setOutputContentClaimFileSizeBytes(Long outputContentClaimFileSizeBytes) {
        this.outputContentClaimFileSizeBytes = outputContentClaimFileSizeBytes;
    }

    /**
     * Returns whether or not the input content is still available.
     *
     * @return
     */
    public Boolean getInputContentAvailable() {
        return inputContentAvailable;
    }

    public void setInputContentAvailable(Boolean inputContentAvailable) {
        this.inputContentAvailable = inputContentAvailable;
    }

    /**
     * Returns the Section in which the input Content Claim lives, or
     * <code>null</code> if no Content Claim exists.
     *
     * @return
     */
    public String getInputContentClaimSection() {
        return inputContentClaimSection;
    }

    public void setInputContentClaimSection(String inputContentClaimSection) {
        this.inputContentClaimSection = inputContentClaimSection;
    }

    /**
     * Returns the Container in which the input Content Claim lives, or
     * <code>null</code> if no Content Claim exists.
     *
     * @return
     */
    public String getInputContentClaimContainer() {
        return inputContentClaimContainer;
    }

    public void setInputContentClaimContainer(String inputContentClaimContainer) {
        this.inputContentClaimContainer = inputContentClaimContainer;
    }

    /**
     * Returns the Identifier of the input Content Claim, or <code>null</code>
     * if no Content Claim exists.
     *
     * @return
     */
    public String getInputContentClaimIdentifier() {
        return inputContentClaimIdentifier;
    }

    public void setInputContentClaimIdentifier(String inputContentClaimIdentifier) {
        this.inputContentClaimIdentifier = inputContentClaimIdentifier;
    }

    /**
     * Returns the offset into the the input Content Claim where the FlowFile's
     * content begins, or <code>null</code> if no Content Claim exists.
     *
     * @return
     */
    public Long getInputContentClaimOffset() {
        return inputContentClaimOffset;
    }

    public void setInputContentClaimOffset(Long inputContentClaimOffset) {
        this.inputContentClaimOffset = inputContentClaimOffset;
    }

    /**
     * Returns the formatted file size of the input content claim.
     *
     * @return
     */
    public String getInputContentClaimFileSize() {
        return inputContentClaimFileSize;
    }

    public void setInputContentClaimFileSize(String inputContentClaimFileSize) {
        this.inputContentClaimFileSize = inputContentClaimFileSize;
    }

    /**
     * Returns the number of bytes of the input content claim.
     *
     * @return
     */
    public Long getInputContentClaimFileSizeBytes() {
        return inputContentClaimFileSizeBytes;
    }

    public void setInputContentClaimFileSizeBytes(Long inputContentClaimFileSizeBytes) {
        this.inputContentClaimFileSizeBytes = inputContentClaimFileSizeBytes;
    }

    /**
     * Returns whether or not replay is available.
     *
     * @return
     */
    public Boolean getReplayAvailable() {
        return replayAvailable;
    }

    public void setReplayAvailable(Boolean replayAvailable) {
        this.replayAvailable = replayAvailable;
    }

    /**
     * Returns the explanation as to why replay is unavailable.
     *
     * @return
     */
    public String getReplayExplanation() {
        return replayExplanation;
    }

    public void setReplayExplanation(String replayExplanation) {
        this.replayExplanation = replayExplanation;
    }

    /**
     * Returns identifier of the FlowFile Queue / Connection from which the
     * FlowFile was pulled to generate this event, or <code>null</code> if
     * either the queue is unknown or the FlowFile was created by this event.
     *
     * @return
     */
    public String getSourceConnectionIdentifier() {
        return sourceConnectionIdentifier;
    }

    public void setSourceConnectionIdentifier(String sourceConnectionIdentifier) {
        this.sourceConnectionIdentifier = sourceConnectionIdentifier;
    }
}
