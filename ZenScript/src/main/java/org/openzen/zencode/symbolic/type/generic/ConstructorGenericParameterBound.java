/*
 * This file is part of MineTweaker API, licensed under the MIT License (MIT).
 * 
 * Copyright (c) 2014 MineTweaker <http://minetweaker3.powerofbytes.com>
 */
package org.openzen.zencode.symbolic.type.generic;

import org.openzen.zencode.symbolic.expression.IPartialExpression;
import org.openzen.zencode.symbolic.method.MethodHeader;
import org.openzen.zencode.symbolic.scope.IMethodScope;
import org.openzen.zencode.symbolic.type.ITypeInstance;

/**
 *
 * @author Stan
 * @param <E>
 * @param <T>
 */
public class ConstructorGenericParameterBound<E extends IPartialExpression<E, T>, T extends ITypeInstance<E, T>>
	implements IGenericParameterBound<E, T>
{
	private final MethodHeader<E, T> header;
	
	public ConstructorGenericParameterBound(MethodHeader<E, T> header)
	{
		this.header = header;
	}

	@Override
	public void completeContents(IMethodScope<E, T> scope)
	{
		header.completeContents(scope);
	}
}