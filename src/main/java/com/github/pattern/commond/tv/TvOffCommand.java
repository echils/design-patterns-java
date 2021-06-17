package com.github.pattern.commond.tv;

import com.github.pattern.commond.ICommand;

/**
 * 关闭电视命令
 *
 * @author echils
 * @since 2020-01-01 21:27:11
 */
public class TvOffCommand implements ICommand {

    private TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void cancel() {
        tv.on();
    }
}
