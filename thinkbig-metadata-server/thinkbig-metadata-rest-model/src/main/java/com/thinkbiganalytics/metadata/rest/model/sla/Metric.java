/**
 * 
 */
package com.thinkbiganalytics.metadata.rest.model.sla;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 *
 * @author Sean Felten
 */
@SuppressWarnings("serial")
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DependentDatasourceMetric.class),
    @JsonSubTypes.Type(value = DependentFeedMetric.class),
    @JsonSubTypes.Type(value = WithinSchedule.class),
})
public abstract class Metric implements Serializable {

}
