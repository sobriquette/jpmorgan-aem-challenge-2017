# jpmorgan-aem-challenge-2017
AEM Code Challenge

Objective:
Create a breadcrumbs component which is compatible with AEM 6.0 or higher. The deliverable should be an AEM package.

Acceptance Criteria:

As a Content Author: I want to be able to exclude pages from the breadcrumb listing so that structural pages or
pages not meant to be navigated to directly are not presented in this context.

As a Site User: I want to be able to see where I am in the site’s content tree so that I understand the context of what I am viewing. I want to be able to navigate to where I have come from in the site so that I can easily jump back and forth between site sections.

Approach:

Used OOTB (out-of-the-box) AEM component Breadcrumb
    - Includes built-in function that gathers a collection of links, i.e. BreadcrumbImpl.getItems();
    - Includes the AEM Page component, which has a isHideInNav(); function that returns whether a page is flagged as hidden or not

To exclude a page from the breadcrumb listing, a content author must do this at the Page component level, rather than the breadcrumb level. If a page is expected to be excluded from the breadcrumb listing, it is also likely that it is not expected to show up in the site map either. Therefore, we can reasonably assume that this should be done at the Page level regardless (although this is something that should be verified with the business analyst).

Future improvements:
1) Immediate improvements for code would be validating that it is syntactically and organizationally correct! It's been a while since I've developed a component in AEM, and the first time I've had to do it without an active project to reference. 

2) Build a breadcrumb component from scratch so there's more control over the naming of attributes and component functionality.

3) Depending on the UI for the breadcrumbs, we could also consider configuring a dialog.xml for it so that allow content authors to handle CSS styles such as font-size, link styling, icon styling (between breadcrumb items)...etc. This would enable the development team to focus on building components and their functionalities, rather than having to update the CSS files manually every time a UI change request is made.
