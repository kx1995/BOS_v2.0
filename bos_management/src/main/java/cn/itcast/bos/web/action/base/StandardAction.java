package cn.itcast.bos.web.action.base;

import cn.itcast.bos.service.base.StandardService;
import cn.itcast.bos.domain.base.Standard;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class StandardAction extends ActionSupport implements ModelDriven<Standard> {

  //创建模型对象
  private Standard standard = new Standard();

  @Override
  public Standard getModel() {
    return standard;
  }

  //注入Sercice对象
  @Autowired
  private StandardService standardService;

  //添加操作
  @Action(value = "standard_save", results = {@Result(name = "success", type = "redirect", location = "./pages/base/standard.html")})
  public String save() {
    System.out.println("执行添加操作");
    standardService.save(standard);
    return SUCCESS;
  }

}
