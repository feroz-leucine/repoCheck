package model;

import java.util.Date;

public class ActionAssignments {
    private int id;
    private String actionType;
    private String assignedTo;
    private Date dueDate;
    private String status;
    private String priorityLevel;
    private String comments;
    private Date creationDate;
    private Date lastModifiedDate;
    private int correctiveActionId;
    private int preventiveActionId;
    private CorrectiveActions correctiveAction;
    private PreventiveActions preventiveAction;

    public ActionAssignments() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getCorrectiveActionId() {
        return correctiveActionId;
    }

    public void setCorrectiveActionId(int correctiveActionId) {
        this.correctiveActionId = correctiveActionId;
    }

    public int getPreventiveActionId() {
        return preventiveActionId;
    }

    public void setPreventiveActionId(int preventiveActionId) {
        this.preventiveActionId = preventiveActionId;
    }

    public CorrectiveActions getCorrectiveAction() {
        return correctiveAction;
    }

    public void setCorrectiveAction(CorrectiveActions correctiveAction) {
        this.correctiveAction = correctiveAction;
    }

    public PreventiveActions getPreventiveAction() {
        return preventiveAction;
    }

    public void setPreventiveAction(PreventiveActions preventiveAction) {
        this.preventiveAction = preventiveAction;
    }
}