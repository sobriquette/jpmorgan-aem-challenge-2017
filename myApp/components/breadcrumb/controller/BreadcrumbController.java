package melodyLin.myApp.aem.breadcrumb.model;

import myApp.components.breadcrumb.model.Breadcrumb;

import com.day.cq.wcm.api.Page;

public class BreadcrumbController {

	private ArrayList<Breadcrumb> breadcrumbs;

	// Grab the breadcrumb links
	public ArrayList<Breadcrumb> getBreadcrumbs() {
		breadcrumbs = Breadcrumb.getItems();
		return breadcrumbs
	}

	// Set attributes for Breadcrumb object
	private Breadcrumb createBreadcrumb(Page page) {
		Breadcrumb newBreadcrumb = new Breadcrumb();

		newBreadcrumb.setLink(page.getPath());
		newBreadcrumb.setLinkTitle(page.getTitle());

		return newBreadcrumb;
	}
}
