# ToastUtils
1.问题：同时显示多个Toast信息提示框，会放在队列中，等前一个Toast关闭后才会显示下一个Toast。

2.原因：Toast是Android用来显示信息的一种机制，跟Dialog不一样的是没有焦点，过一定的时间会自动消失

3.解决方案：为了解决解决Toast重复显示问题，每次创建Toast我们先做下判断，如果有Toast显示，直接改变Toast里面的文字即可
