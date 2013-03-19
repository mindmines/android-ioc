package com.socialize.android.ioc;

import java.lang.reflect.Constructor;
import android.content.Context;

public interface Allocator {

	public <T> T allocate(Context context, Constructor<T> constructor, Object... args) throws Exception;

}