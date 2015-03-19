package dispenser.stack;

import dispenser.EmptyDispenserException;

public class EmptyStackException extends EmptyDispenserException {

    private static final long serialVersionUID = 2598652529440051003L;

    public EmptyStackException() {
    }

    public EmptyStackException(String msg) {
        super(msg);
    }

}
