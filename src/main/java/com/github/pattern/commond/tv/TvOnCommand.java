package com.github.pattern.commond.tv;

import com.github.pattern.commond.ICommand;

/**
 * 打开电视命令
 *
 * @author echils
 * @since 2020-01-01 21:25:32
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
