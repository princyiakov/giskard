package ai.giskard.web.dto;

import com.dataiku.j2ts.annotations.UIModel;
import com.dataiku.j2ts.annotations.UINullable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@UIModel
@NoArgsConstructor
public class CreateFeedbackDTO {
    private Long projectId;
    private Long modelId;
    private Long datasetId;
    @UINullable
    private String targetFeature;
    private String feedbackType;
    @UINullable
    private String featureName;
    @UINullable
    private String featureValue;
    @UINullable
    private String feedbackChoice;
    @UINullable
    private String feedbackMessage;
    private String userData;
    private String originalData;
}
