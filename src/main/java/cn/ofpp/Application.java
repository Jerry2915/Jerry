package cn.ofpp;

import cn.ofpp.core.BoyFriend;
import cn.ofpp.core.GirlFriend;
import cn.ofpp.core.MessageFactory;
import cn.ofpp.core.Wx;

/**
 * 启动类
 *
 * 这个理论上只能用测试号 正式的号 个人认证是不支持模板消息的 企业认证的又必须使用微信模板库里的模板 只有测试的可以自定义模板内容
 * <a href="https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index">申请公众号测试应用地址</a>
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        // new 一个 女友
        GirlFriend girlFriend = new GirlFriend("果粒橙",
                "陕西省", "西安市", "2001-03-30", "2016-9-01", "oRDsj5wJkYeBFJzrnEajbqwoZ02Q");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend));

        // new 一个 男友 也可单独针对一个friend设置模板ID 以达到不同人不同消息
        BoyFriend boyFriend = new BoyFriend("Jerry",
                "广东省", "肇庆市", "2001-08-07", "2016-09-01", "oRDsj5-Sig_n6E05d4ShyG6N5u_s", "Bf0AYI5IfxNMhcgLXKf556b3RpHS-gofjwkkhghtc0Y");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));
        
        // new 一个 男友 也可单独针对一个friend设置模板ID 以达到不同人不同消息
        BoyFriend boyFriend = new BoyFriend("宋亚轩未婚妻",
                "广东省", "肇庆市", "2008-08-08", "2021-04-16", "oRDsj5wJkYeBFJzrnEajbqwoZ02Q", "Bf0AYI5IfxNMhcgLXKf556b3RpHS-gofjwkkhghtc0Y");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));
    }

}
