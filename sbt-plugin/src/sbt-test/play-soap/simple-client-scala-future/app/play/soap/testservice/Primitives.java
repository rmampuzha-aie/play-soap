/*
 * Copyright (C) 2015-2017 Lightbend Inc. <https://www.lightbend.com>
 */
package play.soap.testservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/*
 * THIS FILE IS AUTO GENERATED. DO NOT EDIT THIS FILE MANUALLY.
 *
 * Run 'generate-primitives.py' to regenerate it.
 */

@WebService(targetNamespace = "http://testservice.soap.play/primitives")
public interface Primitives {
    public boolean booleanOp(@WebParam(name = "x") boolean x);
    public java.util.List<java.lang.Boolean> booleanSequence(@WebParam(name = "xs") boolean xs);

    public byte byteOp(@WebParam(name = "x") byte x);
    public java.util.List<java.lang.Byte> byteSequence(@WebParam(name = "xs") byte xs);

    public double doubleOp(@WebParam(name = "x") double x);
    public java.util.List<java.lang.Double> doubleSequence(@WebParam(name = "xs") double xs);

    public float floatOp(@WebParam(name = "x") float x);
    public java.util.List<java.lang.Float> floatSequence(@WebParam(name = "xs") float xs);

    public int intOp(@WebParam(name = "x") int x);
    public java.util.List<java.lang.Integer> intSequence(@WebParam(name = "xs") int xs);

    public long longOp(@WebParam(name = "x") long x);
    public java.util.List<java.lang.Long> longSequence(@WebParam(name = "xs") long xs);

    public short shortOp(@WebParam(name = "x") short x);
    public java.util.List<java.lang.Short> shortSequence(@WebParam(name = "xs") short xs);

}