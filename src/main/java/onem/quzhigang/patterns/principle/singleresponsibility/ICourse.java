package onem.quzhigang.patterns.principle.singleresponsibility;

/**
 * @Copyright (C), 2018, 上海米袋融资有限公司
 * @ProjectName: new_gold_midai
 * @FileName: ICourse
 * @Author: 屈志刚
 * @Date: 2019/3/21/021 17:20
 * @Description:
 * @email ==>> jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
