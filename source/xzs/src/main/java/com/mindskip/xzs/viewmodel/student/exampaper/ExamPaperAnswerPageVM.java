package com.mindskip.xzs.viewmodel.student.exampaper;

import com.mindskip.xzs.base.BasePage;

public class ExamPaperAnswerPageVM extends BasePage {

    private Integer subjectId;

    private Integer createUser;

    /**
     * 试卷状态(1待判分 2完成)
     */
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }
}
