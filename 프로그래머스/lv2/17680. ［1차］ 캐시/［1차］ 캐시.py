def solution(cacheSize, cities):
    cache = []
    answer = 0
    
    if cacheSize == 0 :
        answer = len(cities) * 5
    else :
        for city in cities:
            city = city.upper()
            if not city in cache:
                if len(cache) < cacheSize:
                    cache.append(city)
                    answer += 5
                else :
                    cache.pop(0)
                    cache.append(city)
                    answer += 5
            else :
                cache.pop(cache.index(city))
                cache.append(city)
                answer += 1
    
    return answer