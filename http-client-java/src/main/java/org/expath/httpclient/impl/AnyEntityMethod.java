package org.expath.httpclient.impl;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/**
 * Implements any HTTP extension method, without any entity content.
 *
 * The above point will maybe require to have an empty {@code http:request/http:body}
 * on requests with a method allowing body, but with an empty body.  So at
 * runtime if we do not know the method, we can at least choose between the base
 * classes {@code HttpRequestBase} and {@code HttpEntityEnclosingRequestBase}.
 *
 * @author Florent Georges
 * @date   2009-11-18
 */
public class AnyEntityMethod
        extends HttpEntityEnclosingRequestBase
{
    public String method;
    
    public AnyEntityMethod(final String method)
    {
        super();
        this.method = method;
    }

    public AnyEntityMethod(final String method, final URI uri)
    {
        super();
        this.method = method;
        setURI(uri);
    }

    public AnyEntityMethod(final String method, final String uri)
    {
        super();
        this.method = method;
        setURI(URI.create(uri));
    }

    @Override
    public String getMethod()
    {
        return method;
    }
}


/* ------------------------------------------------------------------------ */
/*  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS COMMENT.               */
/*                                                                          */
/*  The contents of this file are subject to the Mozilla Public License     */
/*  Version 1.0 (the "License"); you may not use this file except in        */
/*  compliance with the License. You may obtain a copy of the License at    */
/*  http://www.mozilla.org/MPL/.                                            */
/*                                                                          */
/*  Software distributed under the License is distributed on an "AS IS"     */
/*  basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.  See    */
/*  the License for the specific language governing rights and limitations  */
/*  under the License.                                                      */
/*                                                                          */
/*  The Original Code is: all this file.                                    */
/*                                                                          */
/*  The Initial Developer of the Original Code is Florent Georges.          */
/*                                                                          */
/*  Contributor(s): Adam Retter                                             */
/* ------------------------------------------------------------------------ */