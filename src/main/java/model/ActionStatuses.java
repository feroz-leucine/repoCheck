package model;

import java.sql.Timestamp;

public class ActionStatuses {
    private int id;
    private String statusName;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private int displayOrder;
    private boolean isActive;
    private int actionStatusId;

    public ActionStatuses() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getActionStatusId() {
        return actionStatusId;
    }

    public void setActionStatusId(int actionStatusId) {
        this.actionStatusId = actionStatusId;
    }

    @Override
    public String toString() {
        return "ActionStatuses{" +
                "id=" + id +
                ", statusName='" + statusName + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", displayOrder=" + displayOrder +
                ", isActive=" + isActive +
                ", actionStatusId=" + actionStatusId +
                '}';
    }
}