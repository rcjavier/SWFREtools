package tv.porst.swfretools.parser.tags;

import java.util.List;

import tv.porst.splib.io.Flag;
import tv.porst.splib.io.UINT16;
import tv.porst.splib.io.UINT8;
import tv.porst.swfretools.parser.actions.Action;
import tv.porst.swfretools.parser.structures.RecordHeader;

public class DefineButton2Tag extends Tag {

	public DefineButton2Tag(final RecordHeader header, final UINT16 buttonID,
			final int reservedFlags, final Flag trackAsMenu, final UINT16 actionOffset, final List<ButtonRecord2> characters, final List<Action> actions,
			final UINT8 actionEndFlag) {
		super(header);
	}

}