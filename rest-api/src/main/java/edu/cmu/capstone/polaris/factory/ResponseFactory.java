package edu.cmu.capstone.polaris.factory;

import edu.cmu.capstone.polaris.entity.Response;
import edu.cmu.capstone.polaris.request.Request;

public interface ResponseFactory {
	public Response getResponse(ResponseType type, Request request);
}
