
package artifacts.processArtifact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stepId",
    "stepName",
    "participants",
    "extendedData",
    "fieldData",
    "nextStepId",
    "previousStepId",
    "globalData",
    "displayOnly"
})
public class Step {

    @JsonProperty("stepId")
    private String stepId;
    @JsonProperty("stepName")
    private String stepName;
    @JsonProperty("participants")
    private List<Participant> participants = new ArrayList<Participant>();
    @JsonProperty("extendedData")
    private List<ExtendedDatum> extendedData = new ArrayList<ExtendedDatum>();
    @JsonProperty("fieldData")
    private List<FieldDatum> fieldData = new ArrayList<FieldDatum>();
    @JsonProperty("nextStepId")
    private List<NextStepId> nextStepId = new ArrayList<NextStepId>();
    @JsonProperty("previousStepId")
    private List<PreviousStepId> previousStepId = new ArrayList<PreviousStepId>();
    @JsonProperty("globalData")
    private List<GlobalDatum> globalData = new ArrayList<GlobalDatum>();
    @JsonProperty("displayOnly")
    private List<DisplayOnly> displayOnly = new ArrayList<DisplayOnly>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stepId")
    public String getStepId() {
        return stepId;
    }

    @JsonProperty("stepId")
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    @JsonProperty("stepName")
    public String getStepName() {
        return stepName;
    }

    @JsonProperty("stepName")
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    @JsonProperty("participants")
    public List<Participant> getParticipants() {
        return participants;
    }

    @JsonProperty("participants")
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @JsonProperty("extendedData")
    public List<ExtendedDatum> getExtendedData() {
        return extendedData;
    }

    @JsonProperty("extendedData")
    public void setExtendedData(List<ExtendedDatum> extendedData) {
        this.extendedData = extendedData;
    }

    @JsonProperty("fieldData")
    public List<FieldDatum> getFieldData() {
        return fieldData;
    }

    @JsonProperty("fieldData")
    public void setFieldData(List<FieldDatum> fieldData) {
        this.fieldData = fieldData;
    }

    @JsonProperty("nextStepId")
    public List<NextStepId> getNextStepId() {
        return nextStepId;
    }

    @JsonProperty("nextStepId")
    public void setNextStepId(List<NextStepId> nextStepId) {
        this.nextStepId = nextStepId;
    }

    @JsonProperty("previousStepId")
    public List<PreviousStepId> getPreviousStepId() {
        return previousStepId;
    }

    @JsonProperty("previousStepId")
    public void setPreviousStepId(List<PreviousStepId> previousStepId) {
        this.previousStepId = previousStepId;
    }

    @JsonProperty("globalData")
    public List<GlobalDatum> getGlobalData() {
        return globalData;
    }

    @JsonProperty("globalData")
    public void setGlobalData(List<GlobalDatum> globalData) {
        this.globalData = globalData;
    }

    @JsonProperty("displayOnly")
    public List<DisplayOnly> getDisplayOnly() {
        return displayOnly;
    }

    @JsonProperty("displayOnly")
    public void setDisplayOnly(List<DisplayOnly> displayOnly) {
        this.displayOnly = displayOnly;
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
