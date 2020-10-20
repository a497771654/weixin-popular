package weixin.popular.bean.wxa;

import java.util.List;

/**
 * @Author: lvliangjun
 * @Date: 2019/8/5 15:57
 */
public class WxaStepInfo {
    private Watermark watermark;
    private List<WxaStepInfoList> stepInfoList;

    public WxaStepInfo() {
    }

    public List<WxaStepInfoList> getStepInfoList() {
        return stepInfoList;
    }

    public void setStepInfoList(List<WxaStepInfoList> stepInfoList) {
        this.stepInfoList = stepInfoList;
    }

    public Watermark getWatermark() {
        return watermark;
    }

    public void setWatermark(Watermark watermark) {
        this.watermark = watermark;
    }

    @Override
    public String toString() {
        return "StepInfo{" +
                "watermark=" + watermark +
                ", stepInfoList=" + stepInfoList +
                '}';
    }
}
