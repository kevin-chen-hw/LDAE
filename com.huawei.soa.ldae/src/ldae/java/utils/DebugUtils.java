/*
 * Copyright © Huawei Technologies Co., Ltd. 1998-2017. All rights reserved. 
 */
package utils;

import org.hibernate.internal.CoreMessageLogger;
import org.jboss.logging.Logger;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * @author j00318686
 * @see
 * @since ONIP SOABean V300R003C00
 */
public class DebugUtils
{
    private static final String VM_ARGUMENT_DEBUG = "dw.debug";

    private static final String VM_ARGUMENT_DEBUG_ON = "on";

    private static final CoreMessageLogger LOG = Logger.getMessageLogger(CoreMessageLogger.class,
            DebugUtils.class.getName());
			
    private static boolean isdebug = false;
	
	static
    {
        String mode = System.getProperty(VM_ARGUMENT_DEBUG);
        if (VM_ARGUMENT_DEBUG_ON.equalsIgnoreCase(mode))
        {
            LOG.debug("Now app runtime env is debug.");
            isdebug = true;
        }
        else
        {
            LOG.debug("Now app runtime env is realese.");
            isdebug = false;
        }
    }

	
    public static boolean isDebug()
    {
        return isdebug;
    }
}
