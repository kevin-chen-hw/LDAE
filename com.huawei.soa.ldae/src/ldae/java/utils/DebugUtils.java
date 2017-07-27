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
    
    public static boolean isDebug;
    
    static
    {
    	String mode = System.getProperty(VM_ARGUMENT_DEBUG);
    	if(VM_ARGUMENT_DEBUG_ON.equalsIgnoreCase(mode))
        {
    		isDebug = true;
        }
    	else
    	{
    		isDebug = false;
    	}
    }
    
    public static boolean isDebug()
    {
    	return isDebug;
    }
}