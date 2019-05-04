package cn.banny.emulator.ios.struct.kernel;

import cn.banny.emulator.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public class TaskGetExceptionPortsRequest extends UnicornStructure {

    public TaskGetExceptionPortsRequest(Pointer p) {
        super(p);
    }

    public NDR_record NDR;
    public int exceptionMask;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("NDR", "exceptionMask");
    }

}
