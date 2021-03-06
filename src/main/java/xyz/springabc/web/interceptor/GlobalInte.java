package xyz.springabc.web.interceptor;


import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;


public class GlobalInte implements WebRequestInterceptor {


    public void afterCompletion(WebRequest arg0, Exception arg1) throws Exception {

    }

    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        request.setAttribute("endTime", System.currentTimeMillis(), RequestAttributes.SCOPE_REQUEST);
    }

    /**
     * 设置页面访问时间
     *
     * @param request
     * @throws Exception
     */
    public void preHandle(WebRequest request) throws Exception {
        long startTime = 0;
        startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime, WebRequest.SCOPE_REQUEST);
    }


}
