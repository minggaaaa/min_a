import time

import pyautogui
from selenium import webdriver
from selenium.webdriver.common.keys import Keys


browser = webdriver.Chrome()

browser.get('http://www.naver.com')

# element = browser.find_element_by_link_text('카페')
#
# print(element.get_attribute('herf'))
# print(element.get_attribute('class'))
#
# element.click()
# time.sleep(1)
# browser.back()
# time.sleep(1)
# browser.refresh()

inputtag = browser.find_element('id','query')
inputtag.send_keys('기상청')

btntag = browser.find_element('xpath','/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button/span[2]')
btntag.click()

btntag = browser.find_element('xpath','//*[@id="main_pack"]/section[1]/div/div/div[1]/div/div[2]/a')
btntag.click()

# browser.execute_script("window.scrollTo(0, 700)")
pyautogui.scroll(-700)

# btntag = browser.find_element('')
# btntag.click()

# pyautogui.scroll(50)
try:
    btntag.send_keys(Keys.PAGE_DOWN)
    print('여기까지 333')

    time.sleep(5)

    browser = webdriver.Chrome()

    browser.get('http://www.naver.com')


    inputtag = browser.find_element_by_id('query')
    inputtag.send_keys('대구날씨')

    print('여기까지 111')
    browser.find_element_by_id('search_btn').click()

    print('여기까지 222')
except Exception as e:
    print(e)


# btntag = browser.find_element_by_xpath('//*[@id="search_btn"]/span[2]')
# btntag.click()





# browser.save_screenshot('samsung.png')

# time.sleep(5)
# browser.close()