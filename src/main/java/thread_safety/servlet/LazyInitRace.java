package thread_safety.servlet;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class LazyInitRace {
    private ExpensiveObject instance = null;

    public ExpensiveObject getInstance() {
        if (instance == null) // Wrong because multiple thread will execute this same time.
            instance = new ExpensiveObject();  // and init the object, therefore there are multiple object created. Solution: double checking
        return instance;
    }
}

class ExpensiveObject { }