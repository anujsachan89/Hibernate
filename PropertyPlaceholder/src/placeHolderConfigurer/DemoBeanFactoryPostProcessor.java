package placeHolderConfigurer;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
		BeanDefinition beandefination = beanFactory.getBeanDefinition("resturantBean");
		MutablePropertyValues propertyValues = beandefination.getPropertyValues();
		
		
		propertyValues.addPropertyValue("welcomeNote", "This is the modified welcomeNote valuse using Bean Factory POst Processor");
		
}
}
