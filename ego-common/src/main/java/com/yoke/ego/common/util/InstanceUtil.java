package com.yoke.ego.common.util;

import com.esotericsoftware.reflectasm.MethodAccess;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yoke on 2018/3/12
 */
public class InstanceUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceUtil.class);

    private static Map<String, MethodAccess> methodMap = new HashMap<String, MethodAccess>();

    private InstanceUtil() {
    }

    /**
     * 执行某对象的方法
     *
     * @param owner
     * @param methodName
     * @param args
     * @return
     */
    public static Object invokeMethod(Object owner, String methodName, Object... args) {
        Class<?> ownerClass = owner.getClass();
        String key = null;
        if (args != null) {
            Class<?>[] argsClass = new Class[args.length];
            for (int i = 0, j = args.length; i < j; i++) {
                if (args[i] != null) {
                    argsClass[i] = args[i].getClass();
                }
            }
            key = ownerClass + "_" + methodName + "_" + StringUtils.join(argsClass, ","); // 用于区分重载的方法
        } else {
            key = ownerClass + "_" + methodName; // 用于区分重载的方法
        }
        MethodAccess methodAccess = methodMap.get(key);
        if (methodAccess == null) {
            methodAccess = MethodAccess.get(ownerClass);
            methodMap.put(key, methodAccess); // 缓存Method对象
        }
        return methodAccess.invoke(owner, methodName, args);
    }
}
