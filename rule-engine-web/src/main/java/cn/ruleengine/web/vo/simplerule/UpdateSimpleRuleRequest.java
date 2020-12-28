package cn.ruleengine.web.vo.simplerule;

import cn.ruleengine.core.rule.AbnormalAlarm;
import cn.ruleengine.web.vo.condition.ConditionGroupConfig;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author dingqianwen
 * @date 2020/8/24
 * @since 1.0.0
 */
@Data
public class UpdateSimpleRuleRequest {

    @NotNull
    private Integer id;

    private List<ConditionGroupConfig> conditionGroup;

    private Action action;

    private DefaultAction defaultAction;

    private AbnormalAlarm abnormalAlarm = new AbnormalAlarm();

}