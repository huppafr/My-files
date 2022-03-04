#!/usr/bin/python3
import datetime
import os
import shutil
from os import path

DEFAULT_PATH = '/home/somename/work'


def file_generator(size: float, name: str):
    '''Функция генерирует файлы для теста'''
    name = name
    index = 1
    for _ in range(5):
        file = f'fallocate -l {size}G {name}{index}.txt'
        index += 1
        os.system (file)


def disk_space_check():
    '''Функция выодит объем всех дисков в системе'''
    disk_space = 'df -h' 
    os.system (disk_space)


def file_archiver():
    '''Функция архивирует файлы в каталоге /home/some_user/work,
       сохраняет архив в каталог /tmp/ и присваивает архиву
       наименование, соответствующее текущей дате'''
    file_generator(0.1, 'small_file') # Закомментить, если не нужны файлы для теста
    os.system(f'zip test.zip {DEFAULT_PATH}*')
    source_file = 'test.zip'
    if path.exists(source_file):
        destination_path = "/tmp/"
        new_location = shutil.move(source_file, destination_path)
    os.chdir('/tmp/')
    date = datetime.datetime.now().strftime('%Y-%m-%d')
    if path.exists(source_file):
        os.rename('test.zip', f'{date}.txt')


def get_file_size(path):
    '''Функция возвращает размер файла'''
    size = os.path.getsize(path)
    return size


def remove_file(path):
    '''Функция удаляет файл'''
    if not os.remove(path):
        print(f'{path} is deleted successfully')

    else:
        print(f'Unable to delete the {path}')


def file_remover():
    '''Функция удаляет все файлы в каталоге /home/some_user/work/
        размер которых более 1 Гб'''
    os.chdir(f'{DEFAULT_PATH}')
    file_generator(1.1, 'big_file') # Закомментить, если не нужны файлы для теста
    path = "."
    if os.path.exists(path):
        size = 1073741824
        for root_folder, folders, files in os.walk(path):
            for file in files:
                file_path = os.path.join(root_folder, file)
                if get_file_size(file_path) >= size:
                    remove_file(file_path)
        else:
            if os.path.isfile(path):
                if get_file_size(path) >= size:
                    remove_file(path)
    else:
        print(f"{path} doesn't exist")


def main():
    disk_space_check()
    file_archiver()
    file_remover()


if __name__ == '__main__':
    main()
