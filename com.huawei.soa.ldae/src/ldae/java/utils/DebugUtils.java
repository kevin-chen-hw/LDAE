/*
 * Copyright © Huawei Technologies Co., Ltd. 1998-2007. All rights reserved.
 */
package utils;

import org.hibernate.internal.CoreMessageLogger;
import org.jboss.logging.Logger;

/**
 * TODO添加类的一句话描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * @author j00318686
 * @see
 *@since ONIP SOABean V300R003C00
 */
public class DebugUtils
{
    private static final String VM_ARGUMENT_DEBUG = "dw.debug";
    
    private static final String VM_ARGUMENT_DEBUG_ON = "on";
    
    private static final CoreMessageLogger LOG = Logger.getMessageLogger(CoreMessageLogger.class,
            DebugUtils.class.getName());
    
    public static boolean isDebug()
    {
        String mode = System.getProperty(VM_ARGUMENT_DEBUG);
        if(VM_ARGUMENT_DEBUG_ON.equalsIgnoreCase(mode))
        {
            LOG.debug("Now app runtime env is debug.");
            return true;
        }
        
        LOG.debug("Now app runtime env is release.");
        return false;
    }
}