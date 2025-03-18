package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JingquxianluEntity;
import com.entity.view.JingquxianluView;

import com.service.JingquxianluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 景区线路
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
@RestController
@RequestMapping("/jingquxianlu")
public class JingquxianluController {
    @Autowired
    private JingquxianluService jingquxianluService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JingquxianluEntity jingquxianlu, 
		HttpServletRequest request){

        EntityWrapper<JingquxianluEntity> ew = new EntityWrapper<JingquxianluEntity>();
    	PageUtils page = jingquxianluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingquxianlu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JingquxianluEntity jingquxianlu, HttpServletRequest request){
        EntityWrapper<JingquxianluEntity> ew = new EntityWrapper<JingquxianluEntity>();
    	PageUtils page = jingquxianluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingquxianlu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JingquxianluEntity jingquxianlu){
       	EntityWrapper<JingquxianluEntity> ew = new EntityWrapper<JingquxianluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jingquxianlu, "jingquxianlu")); 
        return R.ok().put("data", jingquxianluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JingquxianluEntity jingquxianlu){
        EntityWrapper< JingquxianluEntity> ew = new EntityWrapper< JingquxianluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jingquxianlu, "jingquxianlu")); 
		JingquxianluView jingquxianluView =  jingquxianluService.selectView(ew);
		return R.ok("查询景区线路成功").put("data", jingquxianluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JingquxianluEntity jingquxianlu = jingquxianluService.selectById(id);
		jingquxianlu.setClicknum(jingquxianlu.getClicknum()+1);
		jingquxianlu.setClicktime(new Date());
		jingquxianluService.updateById(jingquxianlu);
        return R.ok().put("data", jingquxianlu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JingquxianluEntity jingquxianlu = jingquxianluService.selectById(id);
		jingquxianlu.setClicknum(jingquxianlu.getClicknum()+1);
		jingquxianlu.setClicktime(new Date());
		jingquxianluService.updateById(jingquxianlu);
        return R.ok().put("data", jingquxianlu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JingquxianluEntity jingquxianlu = jingquxianluService.selectById(id);
        if(type.equals("1")) {
        	jingquxianlu.setThumbsupnum(jingquxianlu.getThumbsupnum()+1);
        } else {
        	jingquxianlu.setCrazilynum(jingquxianlu.getCrazilynum()+1);
        }
        jingquxianluService.updateById(jingquxianlu);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JingquxianluEntity jingquxianlu, HttpServletRequest request){
    	jingquxianlu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingquxianlu);

        jingquxianluService.insert(jingquxianlu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody JingquxianluEntity jingquxianlu, HttpServletRequest request){
    	jingquxianlu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingquxianlu);

        jingquxianluService.insert(jingquxianlu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JingquxianluEntity jingquxianlu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jingquxianlu);
        jingquxianluService.updateById(jingquxianlu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jingquxianluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JingquxianluEntity> wrapper = new EntityWrapper<JingquxianluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jingquxianluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JingquxianluEntity jingquxianlu, HttpServletRequest request,String pre){
        EntityWrapper<JingquxianluEntity> ew = new EntityWrapper<JingquxianluEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = jingquxianluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingquxianlu), params), params));
        return R.ok().put("data", page);
    }


}
