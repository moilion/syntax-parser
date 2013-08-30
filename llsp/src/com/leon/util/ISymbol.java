
package com.leon.util;

/**
 * @author : Leon
 * @since : 2013-8-28
 * @see :
 */

public interface ISymbol<T> {
    public int get_line();
    
    public int get_column();
    
    public T get_type();
    
    public Object get_value();
}
