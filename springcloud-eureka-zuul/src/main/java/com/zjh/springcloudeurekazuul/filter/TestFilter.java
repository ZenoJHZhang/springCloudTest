package com.zjh.springcloudeurekazuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/5 14:42
 */
@Component
public class TestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String requestURI = request.getRequestURI();
        return requestURI.equals("/b/getStudentById");
    }

    @Override
    public Object run()  {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String name = request.getParameter("name");
        if (!name.equals("zjh")){
            requestContext.getResponse().setStatus(HttpServletResponse.SC_OK);
            requestContext.setResponseBody("not zjh");
            return null;
        }
        else {
            return null;
        }
    }
}
