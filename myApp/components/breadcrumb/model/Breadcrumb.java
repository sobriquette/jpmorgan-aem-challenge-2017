package melodyLin.myApp.aem.breadcrumb.model;

import com.adobe.cq.wcm.core.components.models.impl.v1.BreadcrumbImpl;

public class Breadcrumb extends BreadcrumbImpl {
	private String link;
	private String linkTitle;

	// Getters and setters
	public void String setLink(String link) {
		this.link = link;
	}

	public void String setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
	}

	public String getLink() {
		return link;
	}

	public String getLinkTitle() {
		return linkTitle;
	}

}