package com.github.pattern.commond.tv;

import com.github.pattern.commond.ICommand;

/**
 * 打开电视命令
 *
 * @author echils
 */
public class TvOnCommand implements ICommand {

    private TV TV;

    public TvOnCommand(TV TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.on();
    }

    @Override
    public void cancel() {
        TV.off();
    }
}
