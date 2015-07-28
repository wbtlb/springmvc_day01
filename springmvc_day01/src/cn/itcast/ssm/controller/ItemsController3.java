package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

/**
 * 
 * <p>
 * Title: ItemsController1
 * </p>
 * <p>
 * Description:ע�⿪��Handler
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author ����.����
 * @date 2015-4-13����10:46:17
 * @version 1.0
 */

@Controller
public class ItemsController3 {

	// ��Ʒ��ѯ�б�
	//@RequestMappingʵ�ֶ�queryItems������url����ӳ�䡣һ��������Ӧһ��url
	@RequestMapping("/queryItems4")
	public ModelAndView queryItems() throws Exception {
		List<Items> itemsList = new ArrayList<Items>();
		// ��list����侲̬����

		Items items_1 = new Items();
		items_1.setName("����ʼǱ�");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");

		Items items_2 = new Items();
		items_2.setName("ƻ���ֻ�");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6ƻ���ֻ���");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// �൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
		modelAndView.addObject("itemsList", itemsList);
		// ָ����ͼ
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}
	
	//��Ʒ���
	
	//��Ʒ�޸�

	// @Override
	// public void handleRequest(HttpServletRequest request, HttpServletResponse
	// response) throws ServletException, IOException {
	// //����service���� ���ݿ⣬��ѯ��Ʒ�б�����ʹ�þ�̬����ģ��
	// List<Items> itemsList = new ArrayList<Items>();
	// //��list����侲̬����
	//
	// Items items_1 = new Items();
	// items_1.setName("����ʼǱ�");
	// items_1.setPrice(6000f);
	// items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
	//
	// Items items_2 = new Items();
	// items_2.setName("ƻ���ֻ�");
	// items_2.setPrice(5000f);
	// items_2.setDetail("iphone6ƻ���ֻ���");
	//
	// itemsList.add(items_1);
	// itemsList.add(items_2);
	//
	// //����ģ������
	// request.setAttribute("itemsList", itemsList);
	// //����ת����ͼ
	// request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request,
	// response);
	//
	// //ʹ�ô˷�������ͨ���޸�response ������Ӧ�����ݸ�ʽ ������Ӧjson����
	// }

	// @Override
	// public ModelAndView handleRequest(HttpServletRequest request,
	// HttpServletResponse response) throws Exception {
	//
	// //����service���� ���ݿ⣬��ѯ��Ʒ�б�����ʹ�þ�̬����ģ��
	// List<Items> itemsList = new ArrayList<Items>();
	// //��list����侲̬����
	//
	// Items items_1 = new Items();
	// items_1.setName("����ʼǱ�");
	// items_1.setPrice(6000f);
	// items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
	//
	// Items items_2 = new Items();
	// items_2.setName("ƻ���ֻ�");
	// items_2.setPrice(5000f);
	// items_2.setDetail("iphone6ƻ���ֻ���");
	//
	// itemsList.add(items_1);
	// itemsList.add(items_2);
	//
	// //����ModelAndView
	// ModelAndView modelAndView = new ModelAndView();
	// //�൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
	// modelAndView.addObject("itemsList", itemsList);
	//
	// //ָ����ͼ
	// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
	//
	// return modelAndView;
	// }

}
