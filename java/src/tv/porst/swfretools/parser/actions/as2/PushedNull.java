package tv.porst.swfretools.parser.actions.as2;

import tv.porst.splib.binaryparser.UINT32;
import tv.porst.splib.binaryparser.UINT8;

public class PushedNull extends PushedValue<UINT32> {

	public PushedNull(final UINT8 type) {
		super(type, new UINT32(type.getBitPosition(), 0));
	}

}
