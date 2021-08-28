package model;

public class Github {
    private String name;
    private String shortName;
    private Icon icon;
    private boolean prefer_relatedApplications;
    private RelatedApplication relatedApplication;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public boolean isPrefer_relatedApplications() {
        return prefer_relatedApplications;
    }

    public void setPrefer_relatedApplications(boolean prefer_relatedApplications) {
        this.prefer_relatedApplications = prefer_relatedApplications;
    }

    public RelatedApplication getRelatedApplication() {
        return relatedApplication;
    }

    public void setRelatedApplication(RelatedApplication relatedApplication) {
        this.relatedApplication = relatedApplication;
    }
}
