#Oct 5, 2014

Add swagger ui sample to the webapp.

To visit the interface, after you deploy the .war on the tomcat server, point your browser to http://localhost:8080/rest-api/ to check it out!

#Nov 8, 2014

visit http://localhost:8080/rest-api/v/hello/abc, you can find the API is responsing an Customer object in JSON format.

#Nov 9, 2014

Candace init project

#Nov 18, 2014

You can test on Inquiry and Shortcut search endpoints.

#Nov 19, 2014

Update documentation. Noted that deprecated classes exist because:

1. when we merged the model from Polaris, some of the models are duplicated. So we stick to the provided model.

2. The current data access layer only allow us to finish some part of the API functionality. So some of the previous classes are useless at this time.
